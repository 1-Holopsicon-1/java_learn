package home.work;

class CodeGenerator {

    private int code;

    public int getCode() {
        return code;
    }

    public void generateCd() {
        code = (int) (Math.random() * 100);
        System.out.println("Kод " + code);
    }

    public boolean checkCode(int in) {
        return code == in;
    }
}
