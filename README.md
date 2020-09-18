* **Technical problems that you encountered during installation and use of MongoDB and how you resolved**  
    - Did not get validation to work at first, fixed by specifying the .txt file ending on the **sha** file
    
* **Any pending issues with this assignment which you did not manage to solve**  
  - No pending issues.  
  
* **The correct validation of the installation package**
![mongoDB sha validation](https://github.com/Severinzz/DAT250/blob/exp3/exp3/1/mangodb%20sha%20validation.JPG "mongoDB sha Validation")  


* **Relevant results obtained during Experiment 1**  
    - Insert many
![Insert many](https://github.com/Severinzz/DAT250/blob/exp3/exp3/1/Insert%20many.JPG "Insert many")  
    - Read  
![Read](https://github.com/Severinzz/DAT250/blob/exp3/exp3/1/read.JPG "Read")  

    - Update  
![Update](https://github.com/Severinzz/DAT250/blob/exp3/exp3/1/update.JPG "Update")  
    - Remove  
![Remove](https://github.com/Severinzz/DAT250/blob/exp3/exp3/1/delte.JPG "Remove")  

    - Bulk write  
![mongoDB sha validation](https://github.com/Severinzz/DAT250/blob/exp3/exp3/1/bulk%20write.JPG "Bulk write")  

* **Experiment 2 example working and the additional Map-reduce operation (and its result) developed by each of you.**  
    - Total price for each customer  
![Total price for each customer](https://github.com/Severinzz/DAT250/blob/exp3/exp3/2/tot%20price%20pr%20cust.JPG "Total price for each cust")  

    - Total and average qty for each item
![Total and average qty for each item](https://github.com/Severinzz/DAT250/blob/exp3/exp3/2/tot%20price%20pr%20cust.JPG "Total and average qty for each item)  

## My own map-reduce operation
    - Map function
![Map func](https://github.com/Severinzz/DAT250/blob/exp3/exp3/2/map%20function.JPG "Map reduce func")  
    
    - Reduce function
![Reduce func](https://github.com/Severinzz/DAT250/blob/exp3/exp3/2/reduce%20func.JPG "Reduce func")  

    - Finalize function
![Finalize func](https://github.com/Severinzz/DAT250/blob/exp3/exp3/2/finalizeFucntion.JPG "Finalize function")  

    - Map reduce and result
![Map reduce and result](https://github.com/Severinzz/DAT250/blob/exp3/exp3/2/result.JPG "Map reduce and result")  


* **Reason about why your implemented Map-reduce operation in Experiment 2 is useful and interpret the collection obtained.**
The recieved collection has the name of the items with the corresponding quantity, price, and total price for each item. It only gets the orders from within a month. (Here march).
This could be useful to see how much each item earned the company especially if compared to the buyin price. It could help to see what
items prices should change, or what items should stop beeing ordered as they dont earn anything in particular.
