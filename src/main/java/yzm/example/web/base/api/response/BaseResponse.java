package yzm.example.web.base.api.response;

/**
 * @author yzm
 * @date 2022/2/22 - 21:01
 */
public class BaseResponse<T> implements Response{

    private static final long serialVersionUID = 6054195169133080009L;

    protected String errCode = "0";
    protected String errMsg;
    protected T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

}
