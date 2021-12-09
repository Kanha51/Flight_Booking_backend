package com.example.users.util;

/**
 * The type User constant.
 */
public class UserConstant {
    /**
     * The constant URL_ADMIN.
     */
    public static final String URL_ADMIN = "/api/v1.0/flight/";

    public static final String URL_USER_LOGIN = "/api/v1.0/";

    /**
     * The constant URL_CANCEL_TICKET.
     */
    public static final String URL_CANCEL_TICKET = "cancel/{pnr}";

    /**
     * The constant URL_SEARCHED_BY_PNR.
     */
    public static final String URL_SEARCHED_BY_PNR = "ticket/{pnr}";

    /**
     * The constant URL_SEARCHED_BY_EMAIL_ID.
     */
    public static final String URL_SEARCHED_BY_EMAIL_ID = "ticket/{emailId}";

    /**
     * The constant URL_BOOK_TICKET.
     */
    public static final String URL_BOOK_TICKET = "booking";

    /**
     * The constant URL_SEARCH_FLIGHT.
     */
    public static final String URL_SEARCH_FLIGHT = "search";

    public static final String URL_FLIGHT_HISTORY = "flighthistory";

    public static final String URL_USER_LOGIN_ = "user/login";
    /**
     * The constant INACTIVE_FLAG.
     */
    public static final int INACTIVE_FLAG = 1;
}