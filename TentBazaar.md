**TentBazaar**

**Overview:**

**TentBazaar** is an online platform designed to simplify the process of **booking tents, event setups, and related services** for occasions such as weddings, parties, festivals, and corporate events. It connects customers with vendors who provide tents, decorations, seating arrangements, lighting, and catering support. 

**Technology Used:**

* Java   
* Spring Boot   
* Spring Data JPA 

**Modules:**

1. Authentication  
2. Customer  
3. Vendor  
4. Inventory  
5. Verification  
6. Booking  
7. Admin  
8. Notification  
9. Exception

   

   

**1.Admin:** The Admin module controls the overall system.  
It is responsible for managing users, vendors, bookings, and platform data. Admin can approve vendors, monitor activities, handle complaints, and ensure smooth operation of the system. 

**2.Vendor:**This module is for tent service providers.  
Vendors can add and manage their services, update pricing, check availability, and handle customer bookings. It helps vendors showcase their offerings and manage business efficiently. 

**3.Customer:** The Customer module allows users to interact with the platform.  
Customers can register, search for services, compare vendors, and make bookings. They can also view booking history and provide ratings or reviews. 

**4.Authorization:** This module manages access control and security.  
 It ensures that only authorized users can access certain features based on their roles (Admin, Vendor, Customer). It works with login systems and often uses frameworks like \*\*Spring Security to enforce permissions.

**5.Booking:** The Booking module handles the **core functionality of reserving services**.  
It manages booking creation, date selection, availability checks, payment status, and cancellation. It ensures there are **no conflicts or double bookings**.   
**6.Inventory:** Manages all items and resources available with vendors, such as tents, utensils,chairs, lighting, and decoration materials.  
It tracks **availability, quantity, and booking status** to prevent double-booking and ensure smooth operations. 

**7.Notification:** Handles communication with users and vendors.  
It sends alerts and updates like booking confirmations, payment status, reminders, and cancellations via email or SMS 

**8.Verification:**Ensures authenticity and trust on the platform.  
It verifies user accounts, vendor details, and documents, helping prevent fraud and maintaining platform reliability. 

**9.Exception:**Manages errors and unexpected situations in the system.  
It handles issues like failed payments, invalid inputs, or booking conflicts, ensuring the system responds gracefully without crashing. 

  

