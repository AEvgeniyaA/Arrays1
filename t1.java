//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

import java.io.IOException;

public class t1 {

        public static void main(String[] args) {
            try {
                randomException();
            } catch (IOException ioe) {
                System.out.println(ioe.toString());
            } catch (MyException me) {
                System.out.println(me.toString());
            } catch (NullPointerException npe) {
                System.out.println(npe.toString());
            } finally {
                System.out.println("Конец");
            }
        }

    public static void randomException() throws IOException,MyException,NullPointerException{
        int i = (int)(Math.random()*3);
        switch (i) {
            case 0:
                throw new IOException();
            case 1:
                throw new NullPointerException();
            case 2:
                throw new MyException();
        }
    }
}

class MyException extends Exception {
    MyException() {
        super();
    }

    MyException(String s) {
        super(s);
        }

    }
