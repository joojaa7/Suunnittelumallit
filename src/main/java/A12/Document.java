package A12;

import java.util.Date;

public class Document implements DocumentInterface{

    private final String name;
    private final Date creationDate;
    private final String content;

    public Document(String content, String name){
        this.content = content;
        this.name = name;
        this.creationDate = new Date(System.currentTimeMillis());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Date getCreationDate(){
        return creationDate;
    }

    @Override
    public String getContent(User user){
        return content;
    }


}
