package home.work;

import java.util.Comparator;

class HubStringComparator implements Comparator<Object> {
    @Override
    public int compare(Object str1, Object str2) {
        return Integer.compare(((String) str1).length(), ((String) str2).length());
    }
}
