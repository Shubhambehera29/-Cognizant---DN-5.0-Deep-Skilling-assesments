public class main {
    public static void main(String[] args) {

        Computer pc = new Computer.Builder()
                .setCPU("i7")
                .setRAM(16)
                .setStorage(512)
                .build();

        pc.display();
    }
}