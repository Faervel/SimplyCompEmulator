package com.simplycompemulator;

public class Interpreter {
    static int PC; // Адрес следующей команды
    static int AC; // Аккумулятор, регистр для арифметики
    static int instr; // Регистр для текущей команды
    static int instr_type; // Код операции (тип команды)
    static int data_loc; // Адрес данных, -1 если его нет
    static int data; // Текущий операнд
    static boolean run_bit = true; // Бит сброса машины для остановки


}
