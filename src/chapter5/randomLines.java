public void randomLines() {
    Random r = new Random();
    Random p = new Random();
    String letters = "abcdefghijklmnopqrstuvwxyz";
    int numLines = 5 + r.nextInt(6);
    
    for(int i = 0; i < numLines; i++) {
        Random q = new Random();
        int lineLength = 1 + q.nextInt(80);
        
        for(int j = 0; j < lineLength; j++) {
            int k = q.nextInt(26);
            char c = letters.charAt(k);
            System.out.print(c);
        }
        System.out.println();
    }
}
