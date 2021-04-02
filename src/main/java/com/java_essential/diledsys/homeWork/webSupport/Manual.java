package com.java_essential.diledsys.homeWork.webSupport;

public interface Manual {

    final String help="h помощь " +"\n"+"q выход " +"\n"+
            "--nc новый клиент " +"\n"+
            "--addp добавить изминить профиль  пользователю " +"\n"+
            " --addsc добавить сервис клиенту"+"\n"+
            "--addserv добавить сервис " +"\n"+
            "--addsp добавить специалиста " +"\n"+
            "--addticket добавить Ticket"+"\n"+
            "#fetch_all_customers - выводит список всех клиентов с соответственными профилями\n" +
            "#fetch_all_tikets - выводит список всех тикетов с клиентами без профилей\n" +
            "#fetch_all_specialists - выводит список всех тех сотрудников с профилями и тикетами\n" +
            "#feth_all_profiles - выводит все профили с соответственными клиентами\n" +
            "#feth_all_services - выводит все сервисы с соответственными клиентами\n" +
            "#save_tiket_to_file_{id} - сохраняет тикет по";
    
}
