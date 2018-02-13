package com.simplycompemulator;

public class Interpreter {
    static int PC; // Адрес следующей команды
    static int AC; // Аккумулятор, регистр для арифметики
    static int instr; // Регистр для текущей команды
    static int instr_type; // Код операции (тип команды)
    static int data_loc; // Адрес данных, -1 если его нет
    static int data; // Текущий операнд
    static boolean run_bit = true; // Бит сброса машины для остановки

    public static void interpret(int memory[], int starting_address) {
        PC = starting_address;
        while(run_bit) {
            instr = memory[PC];
            PC += 1;
            instr_type = get_instr_type(instr);
            data_loc = find_data(instr, instr_type);

            if (data_loc>=0) data = memory[data_loc];
            execute(instr_type, data);
        }
    }

    private static int get_instr_type(int addr) { return 0;}
    private static int find_data(int instr, int instr_type) {return 0;}
    private static void execute(int type, int data) {}
}
