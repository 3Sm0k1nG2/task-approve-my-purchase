v1.0

Created change log.
Implemented all handlers.

Created package 'budgets'.
Created multiple classes of type 'Budget'.

Created package 'interfaces'.
Created interfaces for all major classes.

Created package 'items'.
Created multiple classes of type 'Item'.

Created package 'requests'.
Created multiple classes of type 'Request'.
Changed field type of 'id' to 'UUID'.
old: ... int id;
new: ... UUID id;

Modified package 'handlers'.
Modified class 'Approver'.
Class 'Approver' implements interface 'IHandler'.
Changed structure of 'approve' method in class 'Approver' to requests a 'Request' parameter.
old: ... void approve(int id, double cost, Type type);
new: ... void approve(Request request);
Changed structure of 'canApprove' method in class 'Approver' to requests a 'Request' parameter.
old: ... boolean canApprove(int id, double cost, Type type);
new: ... boolean canApprove(Request request);