package com.example.ItemsAPI.controller;
//
import com.example.ItemsAPI.controller.dto.ItemDto;
import com.example.ItemsAPI.model.Item;
//import com.example.ItemsAPI.repository.ItemRepository;
import com.example.ItemsAPI.repository.ItemRepository;
import com.example.ItemsAPI.service.ItemService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/item" )
public class ItemController
{


@Autowired
private ItemService itemService;


    @CrossOrigin
    @GetMapping( "/all" )
    public Iterable<Item> getItems()
    {
        return itemService.all();
    }

    @CrossOrigin
    @PostMapping
    public Item save( @RequestBody ItemDto itemDto )
    {
        return itemService.save(new Item( itemDto ) );
    }

    @CrossOrigin
    @GetMapping( "/{id}" )
    public Item findItemById( @PathVariable Integer id )
    {
        return itemService.findById( id );
    }

    @CrossOrigin
    @PutMapping( "/{id}" )
    public Item update( @RequestBody ItemDto itemDto, @PathVariable Integer id )
    {
        Item item = itemService.findById( id );
        item.setName( itemDto.getName() );
        item.setDate( itemDto.getDate() );
        item.setItemName( itemDto.getItemName() );
        item.setItemType( itemDto.getItemType() );
        item.setDescription( itemDto.getDescription() );
        item.setReccomend( itemDto.getReccomend() );
        item.setFrequency( itemDto.getFrequency() );
        item.setImg( itemDto.getImg() );
        return itemService.save( item );
    }
    @CrossOrigin
    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        itemService.delete( id );
    }




}















//@RestController
//    @RequestMapping("/item")
//    public class ItemController{
//
//        final ItemService itemService;
//    public ItemController(@Autowired ItemService itemService )
//    {
//        this.itemService = itemService;
//    }
//
//
//        public ItemController(@Autowired ItemRepository itemRepository) {
//            this.itemRepository = itemRepository;
//        }
//
//        @GetMapping
//        public Iterable<Item> getItems() {
//            return itemRepository.findAll();
//        }
//    }

