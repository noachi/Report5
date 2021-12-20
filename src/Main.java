class Main{
    public static void main(String[]args){
        try{
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println("NullPointException例外をcatchしました");
            System.out.println("ーースタックトレース（ここから）ーー");
            e.printStackTrace();
            System.out.println("ーースタックトレースーー（ここまで）ーー");
        }
    }
}