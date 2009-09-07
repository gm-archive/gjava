/*
 * Test ds_stack_copy
 */
dsi = ds_stack_create()
ds2 = ds_stack_create()
ds_stack_push(dsi,10)
ds_stack_push(dsi,11)
ds_stack_push(ds2,2)
ds_stack_copy(ds2,dsi)
show_message("Should be 11:"+string(ds_stack_pop(ds2)));
show_message("Should be 10:"+string(ds_stack_pop(ds2)));
show_message("Should be 0:"+string(ds_stack_pop(ds2)));
show_message("Should be 11:"+string(ds_stack_pop(dsi)));
ds_stack_destroy(dsi);
ds_stack_destroy(ds2);