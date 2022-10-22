import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeCheckerTest {
    // Enter Age and Coutry and return if this peaple ir major or no
    // Description: BR is 18, USA is 21, JP is 20.

    @Test
    @Description("Coutry is BR, Age is major")
    void livingInBrasilButHaveMajorAge() {
        AgeChecker ageChecker = new AgeChecker();
        Boolean resultChecking = ageChecker.personAgeChecker(18, "BR");
        assertTrue(resultChecking);
    }

    @Test
    @Description("Coutry is BR, Age is mirror")
    void livingInBrasilButNoHaveMajorAge() {
        AgeChecker ageChecker = new AgeChecker();
        Boolean resultChecking = ageChecker.personAgeChecker(17, "BR");
        assertFalse(resultChecking);
    }

    @Test
    @Description("Coutry is USA, Age is major")
    void livingInUsaAndHaveMajorAge() {
        AgeChecker ageChecker = new AgeChecker();
        Boolean resultChecking = ageChecker.personAgeChecker(22, "USA");
        assertTrue(resultChecking);
    }

    @Test
    @Description("Coutry is USA, Age is Mirror")
    void livingInUsaButNoHaveMajorAge() {
        AgeChecker ageChecker = new AgeChecker();
        Boolean resultChecking = ageChecker.personAgeChecker(18, "USA");
        assertFalse(resultChecking);
    }

    @Test
    @Description("Coutry is Japan, Age is major")
    void livingInJapanAndHaveMajorAge() {
        AgeChecker ageChecker = new AgeChecker();
        Boolean resultChecking = ageChecker.personAgeChecker(21, "JP");
        assertTrue(resultChecking);
    }

    @Test
    @Description("Coutry is Japan, Age is major")
    void livingInJapanAndButNoHaveMajorAge() {
        AgeChecker ageChecker = new AgeChecker();
        Boolean resultChecking = ageChecker.personAgeChecker(18, "JP");
        assertFalse(resultChecking);
    }
}