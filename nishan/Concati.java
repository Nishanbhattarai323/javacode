public class Concati {
    public static void main(String[] args) {
        String []arr=new String[]{"Detailed","course","java","most","gain","knowledge"};
        StringBuilder sb=new StringBuilder();
        for(String str:arr){
            sb.append(str).append("");
        }
        System.out.println(sb);
    }
}
