package restWebService;

/**
 * @author  2018/7/26 15:52
 **/
public class ResponseBean {

    private long id;

    private String content;

    public ResponseBean(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
