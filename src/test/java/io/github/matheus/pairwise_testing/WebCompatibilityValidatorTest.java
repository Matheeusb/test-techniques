package io.github.matheus.pairwise_testing;

import io.github.matheus.pairwise_testing.WebCompatibilityValidator.Browser;
import io.github.matheus.pairwise_testing.WebCompatibilityValidator.FileType;
import io.github.matheus.pairwise_testing.WebCompatibilityValidator.OperatingSystem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Pairwise Testing
 * <p>
 * <h6>Covered Rules (Negative Scenarios):</h3>
 * <ul>
 *     <li>Internet Explorer is not supported on Mac or iOS.</li>
 *     <li>Safari is not supported on Windows or Linux.</li>
 *     <li>PDF is not supported on Opera.</li>
 *     <li>JavaScript files are not supported on Internet Explorer.</li>
 * </ul>
 *
 * <p>
 * Without Pairwise Testing, the number of test cases would be significantly higher = 216.
 * </p>
 *
 * <p>
 * With Pairwise Testing is used to ensure maximum coverage with minimal test cases = 12.
 * </p>
 */
public class WebCompatibilityValidatorTest {

    @Test
    @DisplayName("Windows | Chrome | GIF => Supported")
    void testWindowsChromeGifSupported() {
        assertTrue(WebCompatibilityValidator.isSupported(
                OperatingSystem.WINDOWS, Browser.CHROME, FileType.GIF));
    }

    @Test
    @DisplayName("Mac | Internet Explorer | JPG => Not Supported")
    void testMacInternetExplorerJPGNotSupported() {
        assertFalse(WebCompatibilityValidator.isSupported(
                OperatingSystem.MAC, Browser.INTERNET_EXPLORER, FileType.JPG));
    }

    @Test
    @DisplayName("Linux | Safari | HTML => Not Supported")
    void testLinuxSafariHTMLNotSupported() {
        assertFalse(WebCompatibilityValidator.isSupported(
                OperatingSystem.LINUX, Browser.SAFARI, FileType.HTML));
    }

    @Test
    @DisplayName("Unix | Firefox | PDF => Supported")
    void testUnixFirefoxPDFSupported() {
        assertTrue(WebCompatibilityValidator.isSupported(
                OperatingSystem.UNIX, Browser.FIREFOX, FileType.PDF));
    }

    @Test
    @DisplayName("Android | Opera | PDF => Not Supported")
    void testAndroidOperaPDFNotSupported() {
        assertFalse(WebCompatibilityValidator.isSupported(
                OperatingSystem.ANDROID, Browser.OPERA, FileType.PDF));
    }

    @Test
    @DisplayName("iOS | Internet Explorer | HTML => Not Supported")
    void testIOSInternetExplorerHTMLNotSupported() {
        assertFalse(WebCompatibilityValidator.isSupported(
                OperatingSystem.IOS, Browser.INTERNET_EXPLORER, FileType.HTML));
    }

    @Test
    @DisplayName("Windows | Firefox | JavaScript => Supported")
    void testWindowsFirefoxJavascriptSupported() {
        assertTrue(WebCompatibilityValidator.isSupported(
                OperatingSystem.WINDOWS, Browser.FIREFOX, FileType.JAVASCRIPT_FILE));
    }

    @Test
    @DisplayName("Unix | Internet Explorer | JavaScript => Not Supported")
    void testUnixInternetExplorerJavascriptNotSupported() {
        assertFalse(WebCompatibilityValidator.isSupported(
                OperatingSystem.UNIX, Browser.INTERNET_EXPLORER, FileType.JAVASCRIPT_FILE));
    }

    @Test
    @DisplayName("Mac | Edge | PNG => Supported")
    void testMacEdgePNGNotSupported() {
        assertTrue(WebCompatibilityValidator.isSupported(
                OperatingSystem.MAC, Browser.EDGE, FileType.PNG));
    }

    @Test
    @DisplayName("Linux | Chrome | JPG => Supported")
    void testLinuxChromeJPGSupported() {
        assertTrue(WebCompatibilityValidator.isSupported(
                OperatingSystem.LINUX, Browser.CHROME, FileType.JPG));
    }

    @Test
    @DisplayName("Android | Safari | JavaScript => Supported")
    void testAndroidSafariJavascriptSupported() {
        assertTrue(WebCompatibilityValidator.isSupported(
                OperatingSystem.ANDROID, Browser.SAFARI, FileType.JAVASCRIPT_FILE));
    }

    @Test
    @DisplayName("iOS | Firefox | PDF => Supported")
    void testIOSFirefoxPDFSupported() {
        assertTrue(WebCompatibilityValidator.isSupported(
                OperatingSystem.IOS, Browser.FIREFOX, FileType.PDF));
    }
}
