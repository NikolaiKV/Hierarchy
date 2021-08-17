class FromBorrowedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.BORROWED) {
            book.setStatus(requestedStatus);
            System.out.println(String.format("Перевод книги из статуса BORROWED в статус %s возможен", book.getStatus()));
        }
    }
}