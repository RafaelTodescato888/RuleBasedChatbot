package domain;

import java.time.Instant;
import java.util.Date;

public class Chat {
    private String message;
    private String name;
    private Date createdAt;

    public Chat() {

    }

    public Chat(String message, String name) {
        this.message = message;
        this.name = name;
        this.createdAt = Date.from(Instant.now());
    }

    public String getMessage() {
        return this.message;
    }

    public String getName() {
        return name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
