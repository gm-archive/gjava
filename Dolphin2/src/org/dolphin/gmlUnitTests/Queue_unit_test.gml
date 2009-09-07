/*
 * Test ds_queue_copy
 */
dsi = ds_queue_create()
ds2 = ds_queue_create()
ds_queue_enqueue(dsi,10)
ds_queue_enqueue(dsi,11)
ds_queue_enqueue(ds2,2)
ds_queue_copy(ds2,dsi)
show_message("Should be 10:"+string(ds_queue_dequeue(ds2)));
show_message("Should be 11:"+string(ds_queue_dequeue(ds2)));
show_message("Should be 0:"+string(ds_queue_dequeue(ds2)));
show_message("Should be 10:"+string(ds_queue_dequeue(dsi)));
ds_queue_destroy(dsi);
ds_queue_destroy(ds2);