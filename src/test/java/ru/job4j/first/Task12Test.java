package ru.job4j.first;

import org.junit.Test;
import ru.job4j.first.Task12;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Task12Test {
    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task12.main(null);
        String expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()
        ).add("Ping").add("Pong").toString();
        assertThat(out.toString(), is(expected));
    }
}