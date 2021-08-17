class FromAvailableStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.AVAILABLE) {
            if (requestedStatus == Status.BORROWED || requestedStatus == Status.ARCHIVED) {
                book.setStatus(requestedStatus);
                System.out.println(String.format("Перевод книги из статуса AVAILABLE в статус %s возможен", requestedStatus));
            } else if (book.getStatus() == Status.AVAILABLE) {
                System.out.println(String.format("Перевод книги из статуса AVAILABLE в статус %s невозможен", requestedStatus));
            }
        }
    }
}