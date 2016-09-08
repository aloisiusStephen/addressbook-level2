package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class UtilsTest {

    private Utils utils;

    @Before
    public void setup() {
        utils = new Utils();
    }
    
    @Test
    public void nullInput_returnsTrue() {
        String test = null;
        assertTrue(utils.isAnyNull(test));       
    }
    
    @Test
    public void nonNullInput_returnsFalse() {
        String test = "";
        assertFalse(utils.isAnyNull(test));       
    }
    
    @Test
    public void allUnique_returnsTrue() {
        List<String> testList = Arrays.asList("one", "two","three");
        assertTrue(utils.elementsAreUnique(testList));
        
        
    }
    
    
}
