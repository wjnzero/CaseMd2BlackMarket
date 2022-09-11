package storage.admin;

import java.io.*;

public class ReadWriteCoin implements IReadWriteCoin{
    public ReadWriteCoin() {
    }
    private static ReadWriteCoin readWriteCoin;

    public static ReadWriteCoin getInstance(){
        if (readWriteCoin == null)
            readWriteCoin = new ReadWriteCoin();
        return readWriteCoin;
    }
    @Override
    public double read() {
        double adminCoin;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            fis = new FileInputStream("admin coin.csv");
            ois = new ObjectInputStream(fis);
            obj = ois.readObject();
        }
        catch (FileNotFoundException e){
            System.out.println("null");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        adminCoin = (double) obj;
        return adminCoin;
    }

    @Override
    public void write(double coin) {
        try {
            FileOutputStream fos = new FileOutputStream("admin coin.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(coin);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
