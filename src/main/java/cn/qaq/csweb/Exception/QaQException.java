package cn.qaq.csweb.Exception;

public class QaQException extends Exception{
    //无参构造方法
    public QaQException(){

        super();
    }

    //有参的构造方法
    public QaQException(String message){
        super(message);

    }

    // 用指定的详细信息和原因构造一个新的异常
    public QaQException(String message, Throwable cause){

        super(message,cause);
    }

    //用指定原因构造一个新的异常
    public QaQException(Throwable cause) {

        super(cause);
    }
}
