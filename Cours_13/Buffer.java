public class Buffer {
    public static void main(String[] args){
        StringBuffer sBuffer = new StringBuffer();

        sBuffer.append("tout le monde !");
        System.out.println(sBuffer);

        sBuffer.insert(0, "Bonjour");
        System.out.println(sBuffer);
    }
}