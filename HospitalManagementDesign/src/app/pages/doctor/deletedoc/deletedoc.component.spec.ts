import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletedocComponent } from './deletedoc.component';

describe('DeletedocComponent', () => {
  let component: DeletedocComponent;
  let fixture: ComponentFixture<DeletedocComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletedocComponent]
    });
    fixture = TestBed.createComponent(DeletedocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
