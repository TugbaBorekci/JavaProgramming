package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "firefox";
        String result ="" ;//temporary value
        boolean validBrowser = browserName == "chrome" || browserName == "firefox" ||
                browserName == "opera" || browserName == "Safari" || browserName == "edge";

        if (validBrowser){
            //5 Options
            if (browserName == "chrome"){
                result = "Chrome Browser is Selected";
        }else if ( browserName == "firefox") {
                result = "FireFox Browser is Selected";
        }else if (browserName == "opera") {
                result = "Opera is Selected";
        }else if (browserName == "Safari") {
                result = "Safari Browser is Selected";
        } else {
                result = "Edge Browser is selected";
            }
         }else{ //this block only gets executed if pre-condition is failed.if you do not have any statement that you want an execute when the pre-condition is failed then you do not need use this block. it will depend on requirement
                result = "Invalid Browser Name";
            }
        System.out.println(result);
    }
}
 /* 1. Create a class called Browser. Write a program that can display
        the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome,
                firefox, opera, safari, edge
        3. if the browser name does not match with the
        out put should be: Invalid Browser Name
       Ex:
        String browser = "chrome";
        Output:
        Chrome Browser is selected
        Note: MUST use nested if
*/