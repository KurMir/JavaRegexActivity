import java.util.regex.*;
import java.util.Scanner;
public class JavaActivityOne {

    public Boolean Names(String name){
        Pattern pattern = Pattern.compile("[^a-zA-Z]|[0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        if(matcher.find()  || name.length() > 50){
            return false;
        }
        return true;
    }

    public Boolean Birthday(String birthday){
        Pattern pattern = Pattern.compile("[1-2][0-9][0-9][0-9]/[0-1][0-9]/[0-3][0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(birthday);
        if(matcher.find() && birthday.length() <= 10){
            return true;
        }
        return false;
    }
    public Boolean Course(String course){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(course);
        if(matcher.find() || course.length() > 50){
            return false;
        }

        return true;
    }

    public Boolean Email(String email){
        Pattern pattern = Pattern.compile("[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(email);
        if(matcher.find()){
            return true;
        }
        return false;
    }

    public String Answer(String birthday, String lastname){
        return "2023-"+birthday.charAt(5)+birthday.charAt(6)+birthday.charAt(8)+birthday.charAt(9)+"-"+lastname.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaActivityOne Jao = new JavaActivityOne();
        boolean isFirstNameCorrect;
        boolean isLastNameCorrect;
        boolean isBirthdayCorrect;
        boolean isCourseCorrect;
        boolean isEmailCorrect;


        JavaActivityOne main = new JavaActivityOne();
        System.out.print("Enter First Name: " );
        String firstName = sc.nextLine();
        isFirstNameCorrect = Jao.Names(firstName);
        System.out.println(isFirstNameCorrect);


        System.out.print("Enter Last Name: " );
        String lastName = sc.nextLine();
        isLastNameCorrect = Jao.Names(lastName);
        System.out.println(isLastNameCorrect);

        System.out.print("Enter Birthday yyyy/mm/dd: " );
        String birthday = sc.nextLine();
        isBirthdayCorrect = Jao.Birthday(birthday);
        System.out.println(isBirthdayCorrect);

        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        isCourseCorrect = Jao.Course(course);
        System.out.println(isCourseCorrect);

        System.out.print("Enter Email Address: ");
        String email = sc.nextLine();
        isEmailCorrect = Jao.Email(email);
        System.out.println(isEmailCorrect);

        if(isFirstNameCorrect && isLastNameCorrect && isBirthdayCorrect
        && isCourseCorrect && isEmailCorrect){
            System.out.println(Jao.Answer(birthday, lastName));
        }else{
            System.out.println("Incorrect Credentials");
        }









    }

}