package com.betrybe.bankaccount;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    AccountNumberFormatter account = new AccountNumberFormatter();
    Scanner menuScanner = new Scanner(System.in);

    try {
      System.out.println("Informe o número da conta:");
      int literalAccountNumber = menuScanner.nextInt();

      System.out.println(
          "Número da conta: " + account.formatAccountNumber(literalAccountNumber)
      );
    } catch (InputMismatchException e) {
      System.out.println("Número da conta inválido!");
    }
  }

}
