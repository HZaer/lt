package com.lt;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Hello {

    @JsonFormat
    private Date time;

    public static void main(String[] args) {

    }
}
