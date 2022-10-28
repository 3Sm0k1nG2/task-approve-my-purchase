package test.common;

public class Response {
    private boolean status;
    private Exception error;
    private Object data;

    public Response(boolean status, Exception error){
        this.status = status;
        this.data = null;
        this.error = error;
    }

    public Response(boolean status, Object data){
        this.status = status;
        this.error = null;
        this.data = data;
    }

    public boolean getStatus(){
        return this.status;
    }

    public Exception getError(){
        return this.error;
    }

    public Object getData(){
        return this.data;
    }
}
