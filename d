[1mdiff --git a/week-07/day-02/day-02/src/main/java/com/greenfoxacademy/day02/controllers/BankAccountController.java b/week-07/day-02/day-02/src/main/java/com/greenfoxacademy/day02/controllers/BankAccountController.java[m
[1mindex 83d4203..7fd96d9 100644[m
[1m--- a/week-07/day-02/day-02/src/main/java/com/greenfoxacademy/day02/controllers/BankAccountController.java[m
[1m+++ b/week-07/day-02/day-02/src/main/java/com/greenfoxacademy/day02/controllers/BankAccountController.java[m
[36m@@ -26,7 +26,7 @@[m [mpublic class BankAccountController {[m
         return "endpoint";[m
     }[m
 [m
[31m-    @PostMapping("/lolk")[m
[32m+[m[32m    @RequestMapping("/lolk")[m
     public String lionKing(Model model) {[m
         bankAccountList.add(new BankAccount("Simba", 2500, "lion", true, true));[m
         bankAccountList.add(new BankAccount("Timon", 300, "meerkat", false, true));[m
[36m@@ -37,9 +37,9 @@[m [mpublic class BankAccountController {[m
         return "listoflionkings";[m
     }[m
 [m
[31m-    @GetMapping("/lolk")[m
[31m-    public String lionking(Model model) {[m
[31m-        model.addAttribute("balist", bankAccountList);[m
[31m-        return "listoflionkings";[m
[31m-    }[m
[32m+[m[32m//    @GetMapping("/lolk")[m
[32m+[m[32m//    public String lionking(Model model) {[m
[32m+[m[32m//        model.addAttribute("balist", bankAccountList);[m
[32m+[m[32m//        return "listoflionkings";[m
[32m+[m[32m//    }[m
 }[m
