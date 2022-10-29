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

v1.1

Removed package 'requests'.
Modified class 'Request'
Moved 'Request' to 'common'.

Created package 'common.types'.
Created enum 'Employee'.
Renamed enum 'common.Type' to 'common.Item'.
Moved enum 'common.Item' to 'common.types'.
Created class 'TypeFormatter'.

Modified package 'handlers'.
Created class 'Handler' extending 'Approver' implementing 'IHandler'.
Extracted repeated logic from all subclasses of 'Approver' into 'Handler'.
Modified class 'Approver' changed interface to 'IApprover'.

Modified package 'interfaces'.
Created interface 'IApprover'.
Modified interface 'IHandler'.

v1.2

Created package 'common.utils'.
Moved 'common.TypeFormatter' to 'common.utils'.

Created source packages 'main'.
Moved all source code to 'main'.

Created source packages 'test'.
Created class 'Main'.
Created class 'RequestTest'.

Created package 'test.common'
Created class 'Response'.

v1.2.1

Removed underscore as starting symbol in all private fields.
Private fields are now called through 'this'.