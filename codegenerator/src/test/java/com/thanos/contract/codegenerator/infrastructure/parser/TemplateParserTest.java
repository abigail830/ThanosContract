package com.thanos.contract.codegenerator.infrastructure.parser;

import com.thanos.contract.codegenerator.domain.model.JunitTemplateFields;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TemplateParserTest {

    private String targetFile = "target/generated-test-sources/DemoTest.java";

    @After
    public void tearDown() throws Exception {
        Files.deleteIfExists(Paths.get(targetFile));
    }

    @Test
    public void parse_to_string() throws IOException {

        final JunitTemplateFields junitTemplateFields = new JunitTemplateFields("Demo", "should_do_sth_when_condition_fulfills",
                "request", "127.0.0.1", 12345,
                Arrays.asList("assertTrue(true);", "assertFalse(false);"), new ArrayList<>());

        final TemplateParser templateParser = new TemplateParser();
        final String result = templateParser.parseJunitTemplateToString(junitTemplateFields);
        System.out.println(result);
        assertTrue(result.contains("DemoTest"));
        assertTrue(result.contains("should_do_sth_when_condition_fulfills()"));
        assertTrue(result.contains("127.0.0.1"));
        assertTrue(result.contains("12345"));
        assertTrue(result.contains("assertTrue(true);"));
        assertTrue(result.contains("assertFalse(false);"));
        assertFalse(result.contains("{{"));
        assertFalse(result.contains("}}"));
        assertFalse(result.contains("= ;"));
    }

    @Test
    public void parse_to_file() throws IOException {

        final JunitTemplateFields junitTemplateFields = new JunitTemplateFields("Demo", "should_do_sth_when_condition_fulfills",
                "request", "127.0.0.1", 12345,
                Arrays.asList("assertTrue(true);", "assertFalse(false);"), new ArrayList<>());

        final TemplateParser templateParser = new TemplateParser();
        templateParser.parseJunitTemplateToFile(junitTemplateFields, targetFile);

        final String result = new String(Files.readAllBytes(Paths.get(targetFile)));
        assertTrue(result.contains("DemoTest"));
        assertTrue(result.contains("should_do_sth_when_condition_fulfills()"));
        assertTrue(result.contains("127.0.0.1"));
        assertTrue(result.contains("12345"));
        assertTrue(result.contains("assertTrue(true);"));
        assertTrue(result.contains("assertFalse(false);"));


    }
}