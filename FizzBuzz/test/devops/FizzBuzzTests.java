package devops;

import org.junit.*;

public class FizzBuzzTests {
private FizzBuzz fizzBuzz ;
@Before
public void setup() {
fizzBuzz = new FizzBuzz() ;
}

@Test

public void numberOutOfRangeReturnsError() {

Assert.assertEquals( "Error", "Number out of range", fizzBuzz.convert( -1 ) ) ;

}


@Test

public void test1() {

int input = 1;

String output = fizzBuzz.convert(input);

Assert.assertEquals("One", output);

}


@Test

public void test20() {

int input = 20;

String output = fizzBuzz.convert(input);

Assert.assertEquals("Twenty", output);

}


@Test

public void test99() {

int input = 99;

String output = fizzBuzz.convert(input);

Assert.assertEquals("Ninety Nine", output);

}

@Test

public void test256() {
int input = 256;
String output = fizzBuzz.convert(input);
 Assert.assertEquals("Two Hundred Fifty Six", output);
}



}