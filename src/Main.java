class Main{
    public static void main(String[]args){
        try{
            String str = "百二十三";
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e){
        System.out.println("NumberFormatException例外をcatchしました");
        }
    }
}