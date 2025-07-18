package io.github.matheus.pairwise_testing;

public class WebCompatibilityValidator {

    public enum OperatingSystem {
        WINDOWS, MAC, UNIX, LINUX, ANDROID, IOS
    }

    public enum Browser {
        INTERNET_EXPLORER, CHROME, FIREFOX, SAFARI, EDGE, OPERA
    }

    public enum FileType {
        GIF, JPG, PDF, JAVASCRIPT_FILE, HTML, PNG
    }

    /**
     * Validates the compatibility of a given operating system, browser, and file type.
     *
     * @param os       Operating system name (e.g., "Windows", "Linux")
     * @param browser  Browser name (e.g., "Google Chrome", "Safari")
     * @param fileType Type of file being used (e.g., "pdf", "gif")
     * @return return true if the combination is supported, false otherwise
     */
    public static boolean isSupported(OperatingSystem os, Browser browser, FileType fileType) {
        if ((os.equals(OperatingSystem.MAC) || os.equals(OperatingSystem.IOS)) &&
                browser.equals(Browser.INTERNET_EXPLORER)) {
            return false;
        }

        if ((os.equals(OperatingSystem.WINDOWS) || os.equals(OperatingSystem.LINUX)) &&
                browser.equals(Browser.SAFARI)) {
            return false;
        }

        if (fileType.equals(FileType.PDF) &&
                browser.equals(Browser.OPERA)) {
            return false;
        }

        if (fileType.equals(FileType.JAVASCRIPT_FILE) &&
                browser.equals(Browser.INTERNET_EXPLORER)) {
            return false;
        }

        return true;
    }
}