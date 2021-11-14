package home.work;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.regex.Pattern;

// Понатыкал protected потому что может ещё пригодится :D
class ServerI extends Server {
    protected static Server inst = null;
    protected String DB_PATH = "./database.json";
    protected HashMap<String, String> db = new HashMap<>();

    ServerI() {
        if (dbCreate())
            dbScheme();
        fileToDb();
    }

    public static Server getInstance() {
        if (inst == null)
            inst = new ServerI();
        return inst;
    }
    /*Ну типо работа с бд*/
    protected boolean dbCreate() {
        File file = new File(DB_PATH);
        if (file.exists()) return false;
        try {
            file.createNewFile();
        }
        catch (IOException ignored) {}
        return true;
    }

    protected void dbScheme() {
        try {
            FileWriter writer = new FileWriter(DB_PATH);
            writer.write("{}");
            writer.flush();
        }
        catch (IOException ignored) {}
    }

    protected void fileToDb() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Path.of(DB_PATH));
            db = gson.fromJson(reader, db.getClass());
            reader.close();

        }
        catch (IOException ignored) {}
    }

    protected void syncDb() {
        try (Writer writer = new FileWriter(DB_PATH)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(db, writer);
        }
        catch (IOException ignored) {}
    }
    // Это уже как должен работь сервер
    /*Взял код из прошлой задачи :D*/
    protected boolean isEmailValid(String login) {
        return Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)
                .matcher(login)
                .matches();
    }

    public boolean reg(String login, String password) {
        if (db.get(login) != null) return false;
        if (!isEmailValid(login)) return false;
        db.put(login, tipoShifr(password));
        syncDb();
        return true;
    }

    public boolean log(String login, String password) {
        if (db.get(login) == null) return false;
        return db.get(login).equals(tipoShifr(password));
    }

    protected String tipoShifr(String str) {
        String hashedString = "";

        try {
            byte[] bytesOfMessage = str.getBytes(StandardCharsets.UTF_8);
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] theMD5digest = md.digest(bytesOfMessage);
            hashedString = new String(theMD5digest, StandardCharsets.UTF_8);
        }
        catch (NoSuchAlgorithmException ignored) {}
        return hashedString;
    }



}
