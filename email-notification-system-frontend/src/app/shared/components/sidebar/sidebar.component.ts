import { Component, signal } from '@angular/core';
import { SidebarItem, SidebarItemComponent } from './sidebar-item/sidebar-item.component';

@Component({
  selector: 'app-sidebar',
  imports: [SidebarItemComponent],
  templateUrl: './sidebar.component.html',
  styleUrl: './sidebar.component.css'
})
export class SidebarComponent 
{
  items = signal<SidebarItem[]>([
    { label: 'Dashboard', routerLink: '/dashboard', active: false },
    { label: 'Produtos', routerLink: '/produtos' , active: false },
    { label: 'Clientes', routerLink: '/clientes' , active: false }
  ]);

  public setActiveItem(itemName: string) {
    this.items.update(items => 
      items.map(item => ({
        ...item,
        active: item.label === itemName
      }))
    )
  }
}
