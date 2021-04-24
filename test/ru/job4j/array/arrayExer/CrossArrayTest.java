package ru.job4j.array.arrayExer;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class CrossArrayTest {
    @Test
    public void whenHasCross() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossArray.printCrossEl(new int[]{1, 3}, new int[]{2, 1});
        assertThat(out.toString(), is("1" + System.lineSeparator()));
    }
}