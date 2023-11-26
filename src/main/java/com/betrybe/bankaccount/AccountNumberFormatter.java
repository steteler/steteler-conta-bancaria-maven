package com.betrybe.bankaccount;


import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String stringAccountNumber = String.valueOf(literalAccountNumber);
    int sizeAccountNumber = stringAccountNumber.length();

    if (sizeAccountNumber < 6) {
      return StringUtils.leftPad(stringAccountNumber, 6, '0');
    } else if (sizeAccountNumber > 6) {
      return StringUtils.right(stringAccountNumber, 6);
    } else {
      return stringAccountNumber;
    }
  }
}