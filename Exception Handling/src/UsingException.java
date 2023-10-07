public class UsingException {
    public static void throwException() throws Exception{ //this method throws exception
        try{
            System.out.println("Method throwexception");
            throw new Exception();//Throw new exception; Exception not caught in
                                 // current try block,
                              // so handled in outer try block

        }
        catch(Exception exception){
            System.err.println("exception handled in method throwException");
            throw exception;
        }
        finally{
            System.err.println("finally executed in throwException");
        }
    }

    public static void doesNotThrowException(){
        try{
            System.out.println("Method doesNotThrowexception");
        }
        catch(Exception exception){
            System.err.println(exception);
        }
        finally{
            System.err.println("end of method does not throw exception");
        }
    }
    public static void main(String args[]){
        try
        {
            throwException(); //a method that throws an exception
        }
        catch(Exception exception)
        {
            System.err.println("Exception handled in main");
        }
        doesNotThrowException();
    }
}
