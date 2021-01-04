
/**
 * Write a description of class Accessor here.
 *
 * @author Muhammad Aulia Rizki
 * @version 2020
 */
public @interface Accessor {
 	String variableName();
 	String variableType() default "String";;
}