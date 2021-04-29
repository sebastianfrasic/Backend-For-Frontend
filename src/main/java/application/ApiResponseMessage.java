package application;

import org.springframework.http.HttpStatus;

@javax.annotation.Generated(value = "com.ibm.mobile.sdkgen.platform.JavaSpringBindingsConfig", date = "2019-03-26T21:21:29.320Z")

@javax.xml.bind.annotation.XmlRootElement
public class ApiResponseMessage<T> {

    private HttpStatus code;
    private String message;
    private T data;
    private Object datos;

    public ApiResponseMessage(){}

    public ApiResponseMessage(HttpStatus code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResponseMessage(HttpStatus code, String message, Object data, boolean esNuevo){
        this.code = code;
        this.message = message;
        this.datos = data;
        esNuevo = true;
    }
    
    public ApiResponseMessage(int code, String message, T data){
        this.code = HttpStatus.valueOf(code);
        this.message = message;
        this.data = data;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public T getData() {
    	return (T) datos;
    }


    public Object getDatos() {
        return datos;
    }

    public void setDatos(Object datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "ApiResponseMessage{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", datos=" + datos +
                '}';
    }
}