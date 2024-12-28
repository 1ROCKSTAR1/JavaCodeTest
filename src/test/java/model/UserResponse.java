package model;

import lombok.*;
import lombok.experimental.Accessors;



    @Accessors(chain = true)
    @Setter
    @Getter
    @EqualsAndHashCode(callSuper = true)
    @ToString(callSuper = true)
    @NoArgsConstructor
    @AllArgsConstructor
    public class UserResponse extends User {

        private String id;
        private String token;

    }
