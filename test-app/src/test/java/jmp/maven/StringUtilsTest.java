package jmp.maven;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testConcat() throws Exception {

        Assert.assertEquals("Hello Eric", StringUtils.concat("Hello ", "Eric"));
    }

    @Test
    public void testConcatEmptyFirst() throws Exception {

        Assert.assertEquals("Eric", StringUtils.concat("", "Eric"));
    }

    @Test
    public void testConcatEmptySecond() throws Exception {

        Assert.assertEquals("Hello ", StringUtils.concat("Hello ", "123"));
    }

}
