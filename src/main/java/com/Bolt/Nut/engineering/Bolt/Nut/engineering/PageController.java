package com.Bolt.Nut.engineering.Bolt.Nut.engineering;

//import com.Bolt.Nut.engineering.Bolt.Nut.engineering.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class PageController {
    

    @Autowired
    private EmailService emailService; // Inject the service
    // Using a static list ensures your data stays there while the app is running
    private static List<Product> products = new ArrayList<>();

    public PageController() {
        // Only load initial data if the list is empty
        if (products.isEmpty()) {
            // BOLTS
            products.add(new Product("Hex Bolt", "Bolts", 12.99, "High tensile steel hex head bolt", "hexbolt.jpg"));
            products.add(new Product("Carriage Bolt", "Bolts", 15.50, "Round head carriage bolt with square neck", "CarriageBolt.jpg"));
            products.add(new Product("Eye Bolt", "Bolts", 22.00, "Forged steel eye bolt for lifting applications", "EyeBolt.jpg"));
            products.add(new Product("Flange Bolt", "Bolts", 18.75, "Hex flange bolt with integrated washer", "FlangeBolt.jpg"));
            products.add(new Product("U-Bolt", "Bolts", 35.00, "Heavy duty U-bolt for pipe mounting", "U-Bolt.jpg"));
            products.add(new Product("Anchor Bolt", "Bolts", 45.00, "Construction anchor bolt", "AnchorBolt.jpg"));
            products.add(new Product("Clevis Bolt", "Bolts", 28.00, "Clevis bolt with head", "ClevisBolt.jpg"));
            
            // NUTS
            products.add(new Product("Hex Nut", "Nuts", 5.99, "Standard hex nut - zinc plated", "HexNut.jpg"));
            products.add(new Product("Lock Nut (Nylon)", "Nuts", 8.50, "Nylon insert lock nut", "LockNutNylon.jpg"));
            products.add(new Product("Castle Nut", "Nuts", 12.00, "Castellated nut for cotter pin", "CastleNut.jpg"));
            products.add(new Product("Wing Nut", "Nuts", 7.50, "Hand-tightened wing nut", "WingNut.jpg"));
            products.add(new Product("Dome Nut", "Nuts", 9.75, "Decorative dome cap nut", "DomeNut.jpg"));
            products.add(new Product("Square Nut", "Nuts", 6.25, "Four-sided square nut", "SquareNut.jpg"));
            products.add(new Product("Flange Nut", "Nuts", 10.50, "Serrated flange nut", "FlangeNut.jpg"));
            products.add(new Product("Coupling Nut", "Nuts", 14.00, "Long coupling/connector nut", "CouplingNut.jpg"));
            products.add(new Product("T-Nut", "Nuts", 11.50, "Pronged tee nut for wood", "T-Nut.jpg"));
            products.add(new Product("Cage Nut", "Nuts", 8.75, "Spring cage nut for rack mounting", "CageNut.jpg"));
            products.add(new Product("Conical Wheel Nut", "Nuts", 16.00, "Tapered wheel lug nut", "ConicalWheelNut.jpg"));
            products.add(new Product("Tube Nut", "Nuts", 13.25, "Compression tube nut", "TubeNut.jpg"));
            products.add(new Product("Acorn Nut", "Nuts", 9.50, "Chrome cap acorn nut", "AcornNut.jpg"));
            products.add(new Product("Rivet Nut", "Nuts", 12.75, "Blind rivet nut insert", "RivetNut.jpg"));

            // WASHERS
            products.add(new Product("Flat Washer", "Washers", 1.50, "Standard flat washer - zinc plated", "FlatWasher.jpg"));
            products.add(new Product("Lock Washer (Split)", "Washers", 2.25, "Split ring lock washer", "LockWasherSplit.jpg"));
            products.add(new Product("Lock Washer (Star)", "Washers", 2.75, "External tooth star washer", "LockWasherStar.jpg"));
            products.add(new Product("Square Washer", "Washers", 3.50, "Square plate washer for timber", "SquareWasher.jpg"));
            products.add(new Product("Fender Washer", "Washers", 4.00, "Large OD fender washer", "FenderWasher.jpg"));
            products.add(new Product("Bonded Washer", "Washers", 3.25, "Rubber bonded sealing washer", "BondedWasher.jpg"));
            products.add(new Product("Cup Washer", "Washers", 2.50, "Countersunk cup washer", "CupWasher.jpg"));
            products.add(new Product("Nord-Lock Washer", "Washers", 8.00, "Wedge-locking washer pair", "Nord-LockWasher.jpg"));
            products.add(new Product("Belleville Washer", "Washers", 5.50, "Conical spring disc washer", "BellevilleWasher.jpg"));
            
            // SCREWS
            products.add(new Product("Socket Head Cap Screw", "Bolts", 25.50, "Allen head socket cap screw", "SocketHeadCapScrew.jpg"));            
            products.add(new Product("Wood Screw", "Screws", 4.50, "Countersunk wood screw", "WoodScrew.jpg"));
            products.add(new Product("Self-Tapping Screw", "Screws", 3.75, "Thread-forming self-tapping screw", "Self-TappingScrew.jpg"));
            products.add(new Product("Machine Screw", "Screws", 5.25, "Pan head machine screw", "MachineScrew.jpg"));
            products.add(new Product("Drywall Screw", "Screws", 3.50, "Bugle head drywall screw", "DrywallScrew.jpg"));
            products.add(new Product("Sheet Metal Screw", "Screws", 4.25, "Self-drilling sheet metal screw", "SheetMetalScrew.jpg"));
            products.add(new Product("Grub Screw", "Screws", 6.00, "Headless set screw", "GrubScrew.jpg"));
            products.add(new Product("Coach Screw", "Screws", 15.00, "Hex head lag screw for wood", "CoachScrew.jpg"));
            products.add(new Product("Chipboard Screw", "Screws", 4.75, "Yellow zinc chipboard screw", "ChipboardScrew.jpg"));
            products.add(new Product("Security Screw", "Screws", 8.50, "Tamper-resistant pin head screw", "SecurityScrew.jpg"));
            
            // TOOLS & HARDWARE
            products.add(new Product("Allen Key Set", "Tools", 85.00, "Metric hex key set 1.5-10mm", "AllenKeySet.jpg"));
            products.add(new Product("Pop Rivet", "Hardware", 2.50, "Aluminum blind rivet", "PopRivet.jpg"));
            products.add(new Product("Wedge Anchor", "Hardware", 12.00, "Concrete expansion wedge anchor", "WedgeAnchor.jpg"));
            products.add(new Product("Chemical Anchor", "Hardware", 18.50, "Resin chemical anchor system", "ChemicalAnchor.jpg"));
            products.add(new Product("Hook (Eye)", "Hardware", 6.75, "Screw-in cup hook", "HookEye.jpg"));
            products.add(new Product("Speed Clip", "Hardware", 1.75, "U-type speed fastener clip", "SpeedClip.jpg"));
            products.add(new Product("R-Clip", "Hardware", 2.00, "Hair pin R-clip", "RClip.jpg"));
            products.add(new Product("E-Clip", "Hardware", 1.50, "Circlip external retaining ring", "EClip.jpg"));
            products.add(new Product("Cotter Pin", "Hardware", 1.25, "Split cotter pin", "CotterPin.jpg"));
            // SPECIALTY ITEMS
            products.add(new Product("Spring Toggle", "Specialty", 8.50, "Plasterboard spring toggle", "SpringToggle.jpg"));
            products.add(new Product("Clevis Pin", "Specialty", 9.75, "Shoulder clevis pin", "ClevisPin.jpg"));
            products.add(new Product("Dowel Pin", "Specialty", 5.50, "Precision ground dowel pin", "DowelPin.jpg"));
            products.add(new Product("Split Pin", "Specialty", 1.75, "Cotter split pin" ,"SplitPin.jpg" ));
            products.add(new Product("Roll Pin", "Specialty", 3.25, "Spring steel roll pin", "RollPin.jpg"));
            products.add(new Product("Threaded Insert", "Specialty", 7.50, "Brass threaded insert for wood", "ThreadedInsert.jpg"));
            products.add(new Product("Sump Plug", "Specialty", 15.00, "Magnetic oil drain plug", "SumpPlug.jpg"));
            products.add(new Product("Furniture Screw", "Specialty", 6.50, "Confirmat furniture connector screw","FurnitureScrew.jpg"));
        }
    }
    
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/products")
    public String products(Model model, @RequestParam(required = false) String category) {
        List<Product> filteredProducts = products;
        
        if (category != null && !category.isEmpty()) {
            filteredProducts = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
        }
        
        model.addAttribute("products", filteredProducts);
        model.addAttribute("selectedCategory", category);
        return "products";
    }

    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute Product product) {
        products.add(product);
        return "redirect:/products";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/inquiry")
    public String inquiry(Model model) {
        // This provides the "inquiry" object your HTML is looking for
        model.addAttribute("inquiry", new Inquiry()); 
        return "inquirypage";
    }

    // Add this to handle the form submission so you don't get another 404
    @PostMapping("/send-inquiry")
    public String sendInquiry(@ModelAttribute Inquiry inquiry) {
        try {
            // Call the email service
            emailService.sendInquiryEmail(inquiry);
            System.out.println("Email sent successfully for: " + inquiry.getName());
            return "redirect:/inquiry?success=true";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/inquiry?error=true";
        }

    }
    
}