package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatePointTest {
    private CoordinatePoint coordinatePoint;

    @Before
    public void setUp() throws Exception {
        coordinatePoint = new CoordinatePoint(24);
    }

    @Test
    public void 자신의_위치가_맞는가() {
        assertEquals(true, coordinatePoint.isMatchPosition(24));
    }
}