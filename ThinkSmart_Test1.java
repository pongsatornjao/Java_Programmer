class Test1 {
    public static void main(String[] args) {
        int maxnum = 100;
        int state = 0;
        for (int i = 2; i < maxnum; i++) {
            for (int j = 2; j < i; j++) {
                state = j;
                if (i % j == 0) {
                    break;
                }
            }
            if (state == i - 1) {
                System.out.println(i);
            }
        }
    }

}