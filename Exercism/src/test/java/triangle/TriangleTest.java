package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    void equilateral_triangles_have_equal_sides() throws TriangleException{
        Triangle triangle = new Triangle(2, 2, 2);
        assertTrue(triangle.isEquilateral());
    }

    @Test
    void triangles_with_oneUnequal_side_are_not_equilateral() throws TriangleException {
        Triangle triangle = new Triangle(2, 3, 2);
        assertFalse(triangle.isEquilateral());
    }

    @Test
    void triangles_with_noSize_AreIllegal()  {
        assertThrows(TriangleException.class,()->new Triangle(0,0,0));
    }

    @Test
    void very_small_triangles_can_be_equilateral() throws TriangleException {
        Triangle triangle = new Triangle(0.5, 0.5, 0.5);
        assertTrue(triangle.isEquilateral());
    }

    @Test
    void isosceles_triangles_have_last_two_sides_equal() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 3);
        assertTrue(triangle.isIsosceles());
       // assertFalse(triangle.isEquilateral());
    }
    @Test
    void no_sides_are_equal_cant_be_isoceles() throws TriangleException {
        Triangle triangle = new Triangle(2, 3, 4);
        assertFalse(triangle.isIsosceles());
    }
    @Test
    void triangles_with_different_AreIllegal()  {
        assertThrows(TriangleException.class,()->new Triangle(1,1,3));
    }
    @Test
    void triangles_with_another_AreIllegal()  {
        assertThrows(TriangleException.class,()->new Triangle(7,3,2));
    }
    @Test
    public void scalene_triangles_have_no_equal_sides() throws TriangleException {
        Triangle triangle = new Triangle(5, 4, 6);
        assertTrue(triangle.isScalene());
    }

    @Test
    void all_sides_equal_are_not_scalene() throws TriangleException {
        Triangle triangle = new Triangle(8,8,8);
        assertFalse(triangle.isScalene());
    }
    @Test
    public void two_sides_equal_are_not_scalene() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 3);
        assertFalse(triangle.isScalene());
    }
    @Test
    public void verySmallTrianglesCanBeScalene() throws TriangleException {
        Triangle triangle = new Triangle(0.5, 0.4, 0.6);
        assertTrue(triangle.isScalene());
    }
}
