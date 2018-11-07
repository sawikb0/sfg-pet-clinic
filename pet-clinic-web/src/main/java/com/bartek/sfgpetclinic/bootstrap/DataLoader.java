package com.bartek.sfgpetclinic.bootstrap;

import com.bartek.sfgpetclinic.model.Owner;
import com.bartek.sfgpetclinic.model.Vet;
import com.bartek.sfgpetclinic.services.OwnerService;
import com.bartek.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jan");
        owner1.setLastName("Kowalski");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Shrek");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Marian");
        vet1.setLastName("Petlover");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Zbyszek");
        vet2.setLastName("Weterynarz");

        vetService.save(vet2);

        System.out.println("Loded Vets...");



    }
}
